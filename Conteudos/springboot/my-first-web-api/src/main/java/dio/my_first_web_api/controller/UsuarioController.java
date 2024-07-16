package dio.my_first_web_api.controller;

import dio.my_first_web_api.model.Usuario;
import dio.my_first_web_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")//centraliza o prefixo no caso users
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping()                      //@GetMapping("/users")
    public List<Usuario> getUsers(){
        return usuarioRepository.findAll();
    }

    //para passar informações simples
    @GetMapping("/{username}")        //@GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return  usuarioRepository.findByUsername(username);
    }

    @DeleteMapping("/{id}")          //@DeleteMapping("/users/{id}")
    public void deleteUser(Integer id){
        usuarioRepository.deleteById(id);
    }

    @PostMapping()        //@PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario){ //converte o JSON em um objeto
        usuarioRepository.save(usuario);
    }
    @PutMapping()        //@PutMapping("/users")
    public void putUser(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }

}
