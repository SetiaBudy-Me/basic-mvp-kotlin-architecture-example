[![kotlin](https://img.shields.io/badge/Kotlin-1.3.xxx-brightgreen.svg)](https://kotlinlang.org/)
[![MVVM](https://img.shields.io/badge/Clean--Code-MVP-brightgreen.svg)](https://github.com/googlesamples/android-architecture) 
[![Kotlin-Android-Extensions](https://img.shields.io/badge/Kotlin--Android--Extensions-plugin-red.svg)](https://kotlinlang.org/docs/tutorials/android-plugin.html)

# Basic MVP Kotlin Architecture Example
Contoh aplikasi Android sederhana untuk menunjukkan cara kerja arsitektur MVP, menggunakan Kotlin.

### Screenshots

<div align:left;display:inline;>
  <img width="20%" height="20%" src="https://github.com/SetiaBudy-Me/basic-mvp-kotlin-architecture-example/blob/master/res/Image%20Screenshot%2001.jpeg"/>
  <img width="20%" height="20%" src="https://github.com/SetiaBudy-Me/basic-mvp-kotlin-architecture-example/blob/master/res/Image%20Screenshot%2002.jpeg"/>
</div>

$~~$
## MVC

***MVP (Model View Presenter)*** adalah turunan dari pola desain arsitektur MVC, dan berfokus pada peningkatan logika presentasi.

<p align="center">
  <img src="https://github.com/SetiaBudy-Me/basic-mvp-kotlin-architecture-example/blob/master/res/android-mvp-flow.png">
</p>

Masing-masing dari komponen tersebut memiliki tanggung jawab sebagai berikut :

1. ***Model*** : Data layer yang menunjuk pada objek dan data yang ada pada aplikasi. Model ini bertanggung jawab atas logikas bisnis.
2. ***View*** : Pada bagian view menampilkan ui/user interface ciri khasnya yaitu Activity atau Fragment.
3. ***Presenter*** : Menghubungkan keduanya yaitu antara model dengan view, selain itu semua logika bisnis diletakkan di presenter ini.

$~~$

### Kelebihan MVP :
- Beban kerja dari View lebih ringan, karena pada view hanya memanggil fungsi yang ada di presenter.
- Membuat Project Menjadi Testable. saat kita membuat aplikasi tentunya kita perlu testing terlebih dahulu sebelum aplikasi direlase, nah dengan menggunakan mvp ini kita lebih mudah untuk menjalankan unit testing.
- Membagi kode menjadi bagian-bagian kecil dan sesederhana mungkin.
- Mempermudah perbaikan code maintenance atau bug.


<!--
Link Sample:
- [Android MVP Architecture](https://github.com/ahmedeltaher/Android-MVP-Architecture)
- [MVP for Android: how to organize the presentation layer](https://antonioleiva.com/mvp-android/)
- [How MVP works and its simple example showing implementation in Kotlin](https://hackernoon.com/https-medium-com-rohitss-android-app-architectures-mvp-with-kotlin-f255b236010a)
- [Android MVP Architecture: Sample App](https://github.com/MindorksOpenSource/android-mvp-architecture)
- [MVP Android Template in Kotlin](https://github.com/gauravk95/mvp-kotlin-android)
- [MVP Example](https://github.com/Mina-Mikhail/MVPExample)
- [MVP (Model View Presenter) Architecture Pattern in Android with Example](https://www.geeksforgeeks.org/mvp-model-view-presenter-architecture-pattern-in-android-with-example/)
- [Kotlin Model View Presenter Simple example](https://github.com/Yalantis/kotlin-mvp-example)
- [Getting Started with MVP (Model View Presenter) on Android](https://www.raywenderlich.com/7026-getting-started-with-mvp-model-view-presenter-on-android)
-->
