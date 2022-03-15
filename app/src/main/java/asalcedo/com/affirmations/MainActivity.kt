package asalcedo.com.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import asalcedo.com.affirmations.adapter.ItemAdapter
import asalcedo.com.affirmations.data.Datasource
import asalcedo.com.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataSet = Datasource().loadAffirmations()

        binding.recyclerView.apply {
            adapter = ItemAdapter(this@MainActivity, myDataSet)
            setHasFixedSize(true)
        }
    }
}