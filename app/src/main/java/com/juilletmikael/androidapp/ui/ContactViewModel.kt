package com.juilletmikael.androidapp.ui

import android.net.Uri
import android.os.Build
import android.provider.ContactsContract
import android.widget.SimpleCursorAdapter

class ContactViewModel {

    private val FROM_COLUMNS: Array<String> = arrayOf(
        if ((Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)) {
            ContactsContract.Contacts.DISPLAY_NAME_PRIMARY
        } else {
            ContactsContract.Contacts.DISPLAY_NAME
        }
    )

    private val TO_IDS: IntArray = intArrayOf(android.R.id.text1)

    // Define variables for the contact the user selects
    // The contact's _ID value
    var contactId: Long = 0
    // The contact's LOOKUP_KEY
    var contactKey: String? = null
    // A content URI for the selected contact
    var contactUri: Uri? = null
    // An adapter that binds the result Cursor to the ListView
    private val cursorAdapter: SimpleCursorAdapter? = null

    fun onActivityCreated(savedInstanceState: Bundle?) {
        // Gets the ListView from the View list of the parent activity
        activity?.also {
            contactsList = it.findViewById<ListView>(R.id.contact_list_view)
            // Gets a CursorAdapter
            cursorAdapter = SimpleCursorAdapter(
                it,
                R.layout.contact_list_item,
                null,
                FROM_COLUMNS, TO_IDS,
                0
            )
            // Sets the adapter for the ListView
            contactsList.adapter = cursorAdapter
        }
        contactsList.onItemClickListener = this
    }
}