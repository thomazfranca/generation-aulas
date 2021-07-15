package com.lojadegames.gamestomy.seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lojadegames.gamestomy.model.Usuario;
import com.lojadegames.gamestomy.repository.UsuarioRepository;




@Service
public class UserDetailsServiceImplements implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		Optional<Usuario> user = userRepository.findByEmail(userName);
		       user
		        .orElseThrow(() -> new UsernameNotFoundException(userName + " not found."));

		return user
				.map(UserDetailsImplements::new).get();
	}
}