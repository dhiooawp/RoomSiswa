package com.example.roomsiswa.model

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.roomsiswa.repositori.RepositoriSiswa

class EntryViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel() {
    /**
     * Berisi Status Siswa Saat ini
     **/
    var UiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    /** Fungsi untuk memvalidasi input*/

    private fun validasiInput(uiState: DetailSiswa = UiStateSiswa.detailSiswa): Boolean {
        return with(uiState) {
            nama.isNotBlank() && alamat.isNotBlank() && telpon.isNotBlank()
        }
    }
}


