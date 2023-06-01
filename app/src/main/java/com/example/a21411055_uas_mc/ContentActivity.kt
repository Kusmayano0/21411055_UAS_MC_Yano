package com.example.a21411055_uas_mc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContentActivity : AppCompatActivity() {
    private lateinit var MovieRecyclerView: RecyclerView
    private lateinit var MovieList : ArrayList<Tumbuhan>
    private lateinit var MovieAdapter : TumbuhanMyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        MovieList = ArrayList()

        MovieList.add(
            Tumbuhan(R.drawable.kantong_semar, "Kantong Semar",
                "Kantong semar merupakan tumbuhan karnivora yang banyak tumbuh liar di hutan Kalimantan. Kantong semar juga merupakan tanaman yang mulai langka keberadaannya. Di Kalimantan sendiri hingga saat ini terdapat 31 jenis Nepenthes atau Kantong semar yang ditemukan pertama kali oleh J.P Breyne pada tahun 1689.")
        )

        MovieList.add(
            Tumbuhan(R.drawable.bangkai, "Rafflesia Arnoldi/Bunga Bangkai",
                "Rafflesia Arnoldi merupakan tanaman langka dengan ciri khasnya yang berbintik-bintik, bunga kemerah-merahan ini dikenal juga sebagai bunga terbesar di dunia dalam hal diameter (Diameter terbesar yang pernah tercatat adalah 105 cm dengan berat mencapai 11 kilogram)." +
                        "Rafflesia Arnoldi kemudian dikelompokkan ke dalam keluarga Euphorbiaceae. Lebarnya mencapai hingga 2 meter dengan berat sekitar 15- 24 pounds. Meski memiliki bentuk yang menarik namun bunga ini mengeluarkan bau busuk yang sangat menyengat.")
        )

        MovieList.add(
            Tumbuhan(R.drawable.acung_jangkung, "Acung Jangkung",
                "Acung jangkung masuk ke dalam kategori talas-talasan, ia hanya dapat dijumpai di Kawasan Jawa Tengah bagian barat dan jawa barat. Hingga saat ini jumlah populasinya terus mengalami penurunan. Kenali berbagai flora yang hidup di setiap provinsi Indonesia pada buku Ensiklopedia Mini Flora Indonesia." +
                        "Diperkirakan jumlah Acung Jangkung dewasa kini telah kurang dari 10.000. Acung Jangkung sendiri memiliki ciri-ciri tangkai berwarna hijau keabu-abuan atau didominasi oleh warna keabu-abuan saja dan totol-totol coklat tua.")
        )

        MovieList.add(
            Tumbuhan(R.drawable.anggrek, "Anggrek Hitam",
                "Anggrek hitam memiliki nama ilmiah Coelogyne pandurat, dengan warna bunga yang khas yaitu kehitaman pada area lidah bunganya. Ciri-ciri Anggrek hitam diantaranya kelopaknya yang membentuk lanset, dengan dominasi warna hijau panjang dan lancip, mahkotanya membentuk lanset melancip, dan daunnya berwarna hijau dengan bentuk memanjang. ")
        )

        MovieList.add(
            Tumbuhan(R.drawable.cendana, "Cendana",
                "Cendana atau nama latinnya Santalum album dapat ditemukan di Nusa Tenggara Timur (NTT) terutama di Pulau Sumba. Cendana sendiri merupakan salah satu pohon yang kaya manfaat, Bau harum yang dikeluarkan pohon cendana membuatnya dapat diolah sebagai wangi-wangian atau aromaterapi dan parfum, kayunya dapat digunakan untuk membuat rempah-rempah, dupa, hingga sangkur keris ia juga bermanfaat sebagai bahan obat herbal." +
                        "Ciri-cirinya Pohon cendana sendiri diantaranya memiliki batang bulat dan kulit warna coklat dengan diameter maksimal 25-30 cm, Daunnya berbentuk elips dengan ujung lancip, Bunganya berwarna merah dengan jumlah kelopak 4 sampai 5 buah.")
        )


        MovieRecyclerView = findViewById(R.id. MovieRecyclerView)
        MovieRecyclerView.setHasFixedSize(true)
        MovieRecyclerView.layoutManager = LinearLayoutManager(this)

        MovieAdapter = TumbuhanMyAdapter(MovieList)
        MovieRecyclerView.adapter = MovieAdapter
        MovieAdapter.onItemClick = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("Movie", it)
            startActivity(intent)
        }
    }
}