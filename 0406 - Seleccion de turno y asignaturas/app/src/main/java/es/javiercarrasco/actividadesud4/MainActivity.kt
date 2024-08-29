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
            var resultado:String = getText(R.string.txt_resultado).toString()

            if (binding.rbManana.isChecked)
                resultado = "$resultado${binding.rbManana.text}\n"
            else resultado = "$resultado${binding.rbTarde.text}\n"

            resultado = "$resultado\n"

            if (binding.cbADA.isChecked)
                resultado = "$resultado${binding.cbADA.text}\n"

            if (binding.cbPMDM.isChecked)
                resultado = "$resultado${binding.cbPMDM.text}\n"

            if (binding.cbPSP.isChecked)
                resultado = "$resultado${binding.cbPSP.text}\n"

            if (binding.cbFOL.isChecked)
                resultado = "$resultado${binding.cbFOL.text}\n"

            binding.tvResumen.text = resultado
        }
    }
}