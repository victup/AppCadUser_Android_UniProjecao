package com.example.usuario;

import android.os.Bundle ;
import android.view.View ;
import android.widget.Button ;
import android.app.Activity ;
import android.app.AlertDialog ;
import android.content.Intent ;

import android.os.Bundle;

public class TelaPrincipalActivity extends Activity {

    Button btcadastrarusuario ;
    Button btlistagemusuarios ;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState ) ;
        setContentView ( R.layout.activity_tela_principal ) ;
        btcadastrarusuario = ( Button ) findViewById ( R.id.btcadastrar_usuario ) ;
        btlistagemusuarios = ( Button ) findViewById ( R.id.bt_listar_usuarios_cadastrados ) ;

        btcadastrarusuario.setOnClickListener ( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTelaCadastro = new
                        Intent(TelaPrincipalActivity.this, CadastroActivity.class);
                startActivity(intentTelaCadastro);
            }
        });

        btlistagemusuarios.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                if (RegistroManager.getRegistros().size() == 0) {
                    (new AlertDialog.Builder(TelaPrincipalActivity.this))
                            .setTitle(" Aviso ")
                            .setMessage(" Não existe nenhum registro cadastrado.")
                            .setNeutralButton(" OK ", null)
                    .show();
                    return;

                }
                Intent intentTelalistagem = new
                        Intent(TelaPrincipalActivity.this, ListagemActivity.class);
                startActivity(intentTelalistagem);
            }

        });

    }
}