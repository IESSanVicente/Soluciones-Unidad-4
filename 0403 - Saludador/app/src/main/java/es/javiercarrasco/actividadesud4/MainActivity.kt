package es.javiercarrasco.actividadesud4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.javiercarrasco.actividadesud4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.etNombre.text!!.isNotEmpty()) {
                binding.labelNombre.error = null
                binding.tvHello.text = resources.getString(
                    R.string.txt_saludo,
                    binding.etNombre.text.toString().trim()
                )
            } else binding.labelNombre.error = getString(R.string.wrg_nombre)

        }
    }
}