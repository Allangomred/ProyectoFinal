package com.proyecto.servicio;


import com.proyecto.Entidad.Usuario;
import com.proyecto.repositorio.UsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alexs
 */
@Service
public class UsuarioServicioImpl implements UsuarioServicio {
    
    @Autowired
    private UsuarioRepositorio repositorio;
    
    @Override
    public List<Usuario> listarTodosLosUsuarios() {
        return repositorio.findAll();
    }

}
