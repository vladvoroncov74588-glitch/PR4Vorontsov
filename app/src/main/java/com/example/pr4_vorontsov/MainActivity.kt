package com.example.pr4_vorontsov // Объявление пакета — уникального идентификатора приложения в системе Android

import android.os.Bundle // Импорт класса Bundle для работы с сохранённым состоянием экрана (например, при повороте)
import android.view.View // Импорт класса View — управляет видимостью элементов (VISIBLE/GONE)
import android.widget.Button // Импорт компонента стандартной кнопки
import android.widget.ImageView // Импорт компонента для отображения графики
import androidx.appcompat.app.AppCompatActivity // Импорт базового класса Activity для обратной совместимости интерфейса

// Главный класс экрана — наследуется от AppCompatActivity (базовое окно приложения)
class MainActivity : AppCompatActivity() {

    // Системный метод жизненного цикла, вызываемый при первом создании экрана
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Вызов родительского метода для инициализации базовых механизмов окна

        // Связывание логического Kotlin-кода с визуальной XML-разметкой формы
        setContentView(R.layout.activity_main)

        // Инициализация переменных: находим элементы UI по их уникальным ID
        val myButton: Button = findViewById(R.id.button) // Главная кнопка «Кликни меня!»
        val buttonClose: Button = findViewById(R.id.buttonClose) // Кнопка «Закрыть» (добавлена в СРС №4)
        val myImage: ImageView = findViewById(R.id.myImageView) // Контейнер для отображения фотографии

        // Регистрация слушателя событий для первой кнопки («Кликни меня!»)
        myButton.setOnClickListener {
            myButton.visibility = View.GONE // Полностью скрываем первую кнопку — она перестаёт занимать место на экране
            myImage.visibility = View.VISIBLE // Делаем контейнер с фотографией видимым
            buttonClose.visibility = View.VISIBLE // Показываем кнопку «Закрыть» для управления просмотром
        }

        // Регистрация слушателя событий для второй кнопки («Закрыть»)
        buttonClose.setOnClickListener {
            myImage.visibility = View.GONE // Скрываем изображение
            buttonClose.visibility = View.GONE // Прячем саму кнопку закрытия
            myButton.visibility = View.VISIBLE // Возвращаем первую кнопку в исходное видимое состояние
        }
    }
}