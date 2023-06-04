# Android Drawable Shapes

The Android Drawable Shapes library provides a collection of pre-defined shapes that can be used as background drawables for various UI elements in Android applications. These shapes can be easily customized and applied to buttons, views, or any other drawable-compatible element in your app.

## Features

- **Circle**: Create circular shapes with customizable properties such as color, radius, and stroke width.
- **Rectangle**: Create rectangular shapes with customizable corner radii and stroke width.
- **Square**: Create square shapes with customizable properties such as color, side length, and stroke width.
- **Line**: Create straight lines with customizable properties such as color, length, and stroke width.
- **Arc and Face**: Create arc shapes with customizable properties such as color, start angle, sweep angle, and stroke width.  
- **Rotate Text**: Display text with the ability to rotate it at a specified angle, allowing for custom orientation and visual effects.

## Getting Started

To use the Android Drawable Shapes library in your Android project, follow these steps:

1. Add the library as a dependency in your project's `build.gradle` file.
   ```gradle
    implementation 'androidx.appcompat:appcompat:1.4.1'
    implementation 'com.google.android.material:material:1.5.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
    ```

2. Import the necessary classes in your Java or Kotlin files.
  ```bash
    import androidx.appcompat.app.AppCompatActivity;
    import android.graphics.Bitmap;
    import android.graphics.Canvas;
    import android.graphics.Color;
    import android.graphics.Paint;
    import android.graphics.RectF;
    import android.media.Image;
    import android.os.Bundle;
    import android.widget.ImageView;
  // Import other drawable classes as needed
  ```

3. Create an instance of the desired drawable shape and set it as the background drawable for your UI element.
  ```bash
    Canvas canvas = new Canvas(bg);    
    Paint paint = new Paint();

    paint.setColor(Color.BLUE); // set blue color  
    paint.setTextSize(50);      // set text size 

    canvas.drawText("Circle",170,600,paint);  // drawble circle text x = 170 & y = 600
    canvas.drawCircle(225,450,180,paint);  // drawble circle width = 225 , height = 450 & radius =180
  ```

4. Customize the drawable properties as per your requirements.<br></br>


## Contributing
Contributions to the Android Drawable Shapes library are welcome! If you find any issues or have suggestions for improvement, feel free to open an issue or submit a pull request.
