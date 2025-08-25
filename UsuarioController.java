package Controller;

import Model.Usuario;
import java.util.ArrayList;

public class UsuarioController {
    private ArrayList<Usuario> usuarios;

    public UsuarioController() {
        usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(String nome, String email) {
        Usuario u = new Usuario(nome, email);
        usuarios.add(u);
    }

    public ArrayList<Usuario> listarUsuarios() {
        return usuarios;
    }
}
