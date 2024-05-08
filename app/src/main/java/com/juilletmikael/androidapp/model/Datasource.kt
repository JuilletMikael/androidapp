import com.juilletmikael.androidapp.model.Contact
import com.juilletmikael.androidapp.R

class Datasource() {
    fun loadContacts(): List<Contact> {
        return listOf<Contact>(
            Contact(R.string.app_name, R.drawable.ic_launcher_background),
            Contact(R.string.app_name, R.drawable.ic_launcher_background),
            Contact(R.string.app_name, R.drawable.ic_launcher_background),
            Contact(R.string.app_name, R.drawable.ic_launcher_background),
            Contact(R.string.app_name, R.drawable.ic_launcher_background),
            Contact(R.string.app_name, R.drawable.ic_launcher_background),
            Contact(R.string.app_name, R.drawable.ic_launcher_background),
            Contact(R.string.app_name, R.drawable.ic_launcher_background),
            Contact(R.string.app_name, R.drawable.ic_launcher_background),
            Contact(R.string.app_name, R.drawable.ic_launcher_background))
    }
}