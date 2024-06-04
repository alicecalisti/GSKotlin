package alicecalisti.com.github.alicecalisti_rm95808_recycleview

import alicecalisti.com.github.alicecalisti_rm95808_recycleview.adapter.ItemsAdapter
import alicecalisti.com.github.alicecalisti_rm95808_recycleview.model.ItemModel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import alicecalisti.com.github.alicecalisti_rm95808_recycleview.ui.theme.Alicecalisti_rm95808_recycleviewTheme
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);
        val itemsAdapter = ItemsAdapter()
        recyclerView.adapter = itemsAdapter

        val button = findViewById<Button>(R.id.incluir)
        val nomePraia = findViewById<EditText>(R.id.nomepraia)
        val cidade = findViewById<EditText>(R.id.cidade)
        val estado = findViewById<EditText>(R.id.estado)

        button.setOnClickListener {
            val item = ItemModel(
                praia = nomePraia.text.toString(),
                cidade = cidade.text.toString(),
                estado = estado.text.toString(),
                onRemove = {
                    itemsAdapter.removeItem(it)
                }
            )

            itemsAdapter.addItem(item)

            nomePraia.text.clear()
            cidade.text.clear()
            estado.text.clear()
        }


    }


}
