import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class Adapter(context: Context, private val list: List<String>): RecyclerView.Adapter<ViewHolderData>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderData {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.la)


    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}
class ViewHolderData(view: View): RecyclerView.ViewHolder(view) {

}