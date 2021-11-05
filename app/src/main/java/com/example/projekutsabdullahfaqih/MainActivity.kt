package com.example.projekutsabdullahfaqih

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.mts2, "Slawi","Mts negeri 2 tegal","Sehubungan dengan hal tersebut maka semua warga sekolah harus mau untuk belajar menggunakan komputer dan internet, agar dapat meng-akses segala informasi yang berhubungan dengan sekolah dan pengetahuan di internet.\n" +
                "MTsN 2 Tegal is at MTsN 2 Tegal." ))

        data?.add(DataModel(R.drawable.smp1,"Banjaran","Smp negeri 1 adiwerna","Pendidikan di SMP Negeri 1 Adiwerna ditujukan untuk mempersiapkan sumber daya manusia yang tangguh sehingga mampu hidup selaras dengan perubahan jaman dengan mengacu pada pendidikan karakter yang baik. Bukanlah hal yang pertama kali bahwa SMP Negeri 1 Adiwerna telah berkali-kali memunculkan output dari lulusan-lulusan SMP Negeri 1 Adiwerna untuk bertarung di kancah prestasi yang membanggakan, tetap tertunduk seperti padi yang ranum, dan tetap ramah dengan sesama, sehingga banyak dari lulusan SMP Negeri 1 Adiwerna ini menjadi orang-orang yang berhasil membentuk karakternya sendiri-sendiri menuju masa depan yang cerah sesuai dengan harapan."))

        data?.add(DataModel(R.drawable.smp2,"Pagiyanten","Smp negeri 2 adiwerna","Meskipun letak  SMP Negeri 2 Adiwerna tergolong pelosok namun sangat strategis berdiri di tepi jalan Sadewa Desa Kedungsukun memungkinkan untuk tumbuh dan berkembang menjadi sekolah yang bermutu.\n" +
                "Lingkungan SMP Negeri 2 Adiwerna merupakan desa-desa yang berbasis petani dan pedagang. Dari data statistik, masyarakat pada umumnya sebagai  pedagang kecil,  petani yang memiliki taraf kehidupan dengan penghasilan minim, tingkat pendidikan mayoritas masih rendah. Meskipun demikian tingkat kepercayaan masyarakat kepada SMP Negeri 2 Adiwerna cukup besar. Hal ini ditunjukkan oleh rasio siswa yang diterima dan pendaftar dari tahun ke tahun semakin besar. Hal ini membuktikan bahwa kepercayaan masyarakat terhadap eksistensi SMP Negeri 2 Adiwerna cukup tinggi.\n" +
                "'"))

        data?.add(DataModel(R.drawable.smp3,"ujugrusi","Smp negeri 3 adiwerna","smp n 3 adiwerna mempunyai sebuah perpustakaan yang sudah cukup bagus\n" +
                "setiap hari pasti banyak siswa yang meminjam buku di perpustakaan mulai dari kelas 7,8 dan 9\n" +
                "banyak buku-buku yang menarik di dalam perpustakaan smp negeri 3 adiwerna ada buku fiksi dan\n" +
                "non fiksi semuanya masih bagus-bagus.\n"))

        data?.add(DataModel(R.drawable.smp4,"Kaliwadas","Smp negeri 4 adiwerna","SMP Negeri 4 ADIWERNA  didirikan karena kebutuhan dan kehendak masyarakat. Kala itu yang membutuhkan akan adanya pendidikan Sekolah Menengah Pertama yaitu masyarakat yang berdomisili antara jalan Singkil sampai daerah perbatasan Kabupaten Brebes (Desa Kalipucang, Kalialang, dan Kalimati). Oleh karena itu pada tahun 1986, Bapak Warjo Selaku Kepala Desa Kaliwadas mengijinkan dan menyediakan tanah yang luasnya + 1,7 hektar untuk didirikan gedung SMP. Pada tahun itu juga tepatnya bulan juli 1986 sudah menerima siswa baru sebanyak 3 Rombel (Rombongan belajar). Untuk sementara kegiatan belajar mengajar menempati gedung SD Kaliwadas, sambil menunggu pembangunan gedung SMP Negeri 4 Adiwerna yang sedang di kerjakan.\n" +
                "Pada tahun ajaran baru yang pertama yaitu tahun pelajaran 1986/1987 terdiri dari 3 kelas yaitu kelas IA, IB, dan IC. Tiap kelas terdiri dari 48 siswa dan masih menempati gedung SD kaliwadas Kecamatan Adiwerna. Pada waktu itu yang mengampu SMP Negeri 4 Adiwerna sebagian besar dari guru guru SMP Negeri 1 Dukuturi dengan Kepala Sekolahnya Bapak Ngadimin dan Wakil Kepala Sekolahnya Bapak Saliro Untung.\n "))

        data?.add(DataModel(R.drawable.smp5,"Banjaran","Smp negeri 5 adiwerna","Selamat datang di website sekolah SMP Negeri 5 Adiwerna, website ini adalah tempat berbagi informasi secara resmi yang dimiliki dan dikelola oleh SMP Negeri 5 Adiwerna. Semoga dengan kehadiran Website ini akan terjalin informasi, komunikasi antar alumni khususnya sebagai salah satu upaya sekolah mendapatkan informasi akan penelusuran tamatan/ alumni dimana saja berada. Dapat memperoleh informasi dengan cepat sehingga dapat mengikuti perkembangan dalam pengetahuan yang berkembang dengan cepat pula.\n" +
                "\n" +
                "Kesiapan dari semua warga sekolah sangat besar artinya bagi keberadaan website tersebut, sebab tanpa kesiapan dari warga sekolah maka keberadaan website tersebut akan tidak ada gunanya.\n"))





        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.alamat)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}