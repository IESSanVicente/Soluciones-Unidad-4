package es.javiercarrasco.actividadesud4

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import es.javiercarrasco.actividadesud4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.etCorreo.text!!.isNotEmpty()) {
                if (binding.etCorreo2.text!!.isNotEmpty()) {
                    with(binding) {
                        if (etCorreo.text.toString().equals(etCorreo2.text.toString()))
                            msgCorreo(getString(R.string.txt_iguales))
                        else msgCorreo(getString(R.string.txt_noIguales))
                    }
                } else binding.etCorreo2.error = getString(R.string.wrg_correo)
            } else binding.etCorreo.error = getString(R.string.wrg_correo)
        }
    }

    private fun msgCorreo(msg: String) {
        Toast.makeText(
            this@MainActivity,
            msg,
            Toast.LENGTH_SHORT
        ).show()
    }
}