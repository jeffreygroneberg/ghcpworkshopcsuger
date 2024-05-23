# Image Gallery with Animations
<!-- REPLACE THE TITLE WITH THE NAME OF THE EXERCISE -->

This exercise will help you create a simple image gallery with animations using JavaScript and CSS leveraging Github Copilot.

## 🎯 Goal
<!-- ONE SENTENCE ABOUT THE GOAL OF THE EXERCISE -->
The image gallery should look and behave like the following example:

![Example](./images/wobble.gif)


## ✍️ Programming Languages
<!-- BULLETED LIST OF LANGUAGES INVOLVES -->
- JavaScript
- HTML
- CSS

## 💻 IDE and tools
<!-- OPTIONALLY SPECIFY THE IDE THAT SHOULD BE USED -->
- Visual Studio Code
- [Live Server extension](https://marketplace.visualstudio.com/items?itemName=ritwickdey.LiveServer)

## 🗒️ Guide
<!-- STEP BY STEP ISNTRUCTIONS DETAILING HOW TO COMPLETE THE EXERCISE -->

## Inialize the project

First of all it is necessary to have a folder created in which you will create the project. Navigate to this folder via terminal and run the following command:

```bash
code .
```

Create an empty `index.html` file.

## Creating the HTML structure

Create an html file that has all the basic elements to get started with the gallery.

> [!Important]
> Use a comment as a prompt in your html file to initialize the project and then using the [Live Server extension](https://marketplace.visualstudio.com/items?itemName=ritwickdey.LiveServer) in Visual Studio Code, you can view the html file in the browser.

> [!Tip]
> - You can use the following comment in your html file to initialize the project: ``<!-- very basic structure of a modern html page with head body etc -->``
> - There is also a shortcut to create the basic html structure in Visual Studio Code. Just type `!` and press `Tab` key.

### Solution

```html
<!DOCTYPE html>
<html>
<head>
    <title>My First HTML Page</title>
</head>
<body>
    <h1>Hello World!</h1>
    <p>This is my first HTML page.</p>
</body>

</html>
```

You can have a look at your html file in the browser by right clicking on the file and selecting `Open with Live Server`.

![./images/1.png](./images/1.png)

## Adding images to the gallery

In this step, you will add images to the gallery. The galleries should be random images using the `unsplash` API. As we know that we will need further styling add a class to it.

> [!Important]
> Add nine images to the gallery using the `unsplash` API for random images. Use a comment as a prompt in your html file to add images to the gallery.


> [!Tip]
> - You can use the following comment in your html file to add images to the gallery: `` <!-- image gallery using random images from the unsplash page. For further styling already add appropriate classes. All images should have the same width and height -->``
> - Remember to close the `div` tag after adding all the images.

### Solution

```html
<!-- very basic structure of a modern html page with head body etc -->
<!DOCTYPE html>
<html>
  <head>
    <title>My First HTML Page</title>
  </head>
  <body>
    <h1>Hello World!</h1>
    <p>This is my first HTML page.</p>
    <!-- image gallery using random images from the unsplash page. For further styling already add appropriate classes. All images should have the same width and height -->
    <div class="gallery">
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 1"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 2"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 3"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 4"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 5"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 6"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 7"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 8"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 9"
      />
    </div>
  </body>
</html>
```

Refresh your browser to see the images in the gallery.

### Adding a Polariod effect to the images

In this step, you will add a polaroid effect to the images.

> [!Important]
> - Ask Github Copilot Chat to generate the CSS code for the polaroid effect. Remember to have the index.html file open in the editor.

> [!Tip]
> - You can use the following prompt in Github Copilot chat to generate the CSS code for the polaroid effect: ``I want these images to look like a polaroid photo. What do I need to add?``
> - Inspect the result and copy over the complete ``<style>`` tag to your html file.

### Solution

```html
<!-- very basic structure of a modern html page with head body etc -->
<!DOCTYPE html>
<html>
  <head>
    <title>My First HTML Page</title>
    <style>

      .gallery img {
        width: 200px;
        height: 200px;
        box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
        transition: 0.3s;
        border: 15px solid white;
        border-radius: 5px;
      }

      .gallery img:hover {
        box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);
      }

    </style>
  </head>
  <body>
    <h1>Hello World!</h1>
    <p>This is my first HTML page.</p>
    <!-- image gallery using random images from the unsplash page. For further styling already add appropriate classes. All images should have the same width and height -->
    <div class="gallery">
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 1"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 2"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 3"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 4"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 5"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 6"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 7"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 8"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 9"
      />
    </div>
  </body>
</html>
```

Refresh your browser to see the polaroid effect on the images in the gallery. Hover with your mouse over the different images to see the shadow effect.

### Align the images in a 3x3 grid

In this step, you will align the images in a 3x3 grid. It is important that the gallery should always be in the center of the page.

> [!Important]
> - Ask Github Copilot Chat to generate the CSS code for the 3x3 grid. Remember to have the index.html file open in the editor.

> [!Tip]
> - Go in the style tag and add the following comment to prompt Github Copilot to generate the CSS code for the 3x3 grid: `` /* align the images to be a gallery with 3 by 3 grid. The gallery should always be in the center of the screen */``
> - Press tab to accept the suggestion

### Solution

```html
<!-- very basic structure of a modern html page with head body etc -->
<!DOCTYPE html>
<html>
  <head>
    <title>My First HTML Page</title>
    <style>
      /* align the images to be a gallery with 3 by 3 grid. The gallery should always be in the center of the screen */
        .gallery {

            display: grid;
            grid-template-columns: repeat(3, 1fr);
            grid-gap: 10px;
            justify-content: center;
            align-items: center;
            margin: 0 auto;
            width: 600px;
            
        }

      .gallery img {
        width: 200px;
        height: 200px;
        box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
        transition: 0.3s;
        border: 15px solid white;
        border-radius: 5px;
      }

      .gallery img:hover {
        box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);
      }
    </style>
  </head>
  <body>
    <h1>Hello World!</h1>
    <p>This is my first HTML page.</p>
    <!-- image gallery using random images from the unsplash page. For further styling already add appropriate classes. All images should have the same width and height -->
    <div class="gallery">
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 1"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 2"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 3"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 4"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 5"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 6"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 7"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 8"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 9"
      />
    </div>
  </body>
</html>
```

Refresh your browser to see the images in a 3x3 grid in the center of the page.

## Adding animations to the images

In this step, you will add animations to the images. The images should wobble when you hover over them.

> [!Important]
> - Use either Github Copilot chat or a comment in the style tag to generate the CSS code for the wobble effect. Remember to have the index.html file open in the editor.

> [!Tip]
> - You can use the following comment in the style tag to generate the CSS code for the wobble effect: ``/* an image should rotate slowly few degrees from left to right and right to left
      when hovering the mouse over it in an infinite loop. When moving out of the img the img should rotate back slowly with an animation in its basic position */``
> - Press tab to accept the suggestions. It might be more than one :)
> - You can also ask Github Copilot Chat to generate the CSS code for the wobble effect.
> - Play around with the values of the keyframes to see how the wobble effect changes.
>

### Solution

```html
<!-- very basic structure of a modern html page with head body etc -->
<!DOCTYPE html>
<html>
  <head>
    <title>My First HTML Page</title>
    <style>
      /* align the images to be a gallery with 3 by 3 grid. The gallery should always be in the center of the screen */
      .gallery {
        display: grid;
        grid-template-columns: repeat(3, 1fr);
        grid-gap: 10px;
        justify-content: center;
        align-items: center;
        margin: 0 auto;
        width: 600px;
      }

      .gallery img {
        width: 200px;
        height: 200px;
        box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
        border: 15px solid white;
        border-radius: 5px;
      }

      .gallery img:hover {
        box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);
      }

      /* an image should rotate slowly few degrees from left to right and right to left
      when hovering the mouse over it in an infinite loop. When moving out of the img the img should rotate back slowly with an animation in its basic position */
        .gallery img:hover {
            animation: rotate 2s infinite;
        }

        @keyframes rotate {
            0% {
                transform: rotate(0deg);
            }
            50% {
                transform: rotate(5deg);
            }
            100% {
                transform: rotate(0deg);
            }
        }      
    </style>
  </head>
  <body>
    <h1>Hello World!</h1>
    <p>This is my first HTML page.</p>
    <!-- image gallery using random images from the unsplash page. For further styling already add appropriate classes. All images should have the same width and height -->
    <div class="gallery">
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 1"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 2"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 3"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 4"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 5"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 6"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 7"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 8"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 9"
      />
    </div>
  </body>
</html>
```

Refresh your browser to see the wobble effect on the images in the gallery. Hover with your mouse over the different images to see the wobble effect.

### Reducing the Opacity of non-hovered images

In this step, you will reduce the opacity of the non-hovered images.

> [!Important]
> - Use either Github Copilot chat or a comment in the style tag to generate the CSS code for the opacity effect. Remember to have the index.html file open in the editor.
> - We recommend rather using Copilot chat for this step.
> - Try to explain exactly what you want to achieve in the chat.

> [!Tip]
> - You can use the following prompt in the chat: ``I would like to reduce the opacity of all non-hovered images to 0.6 when I hover over an image.``
> - Copy over the generated CSS code to your html file.
> - Ask Copilot chat to clean up your style tag to merge all the scattered styling for the same elements: ``Can you clean the style tag for me and give me a better result?``

### Solution

```html
<!-- very basic structure of a modern html page with head body etc -->
<!DOCTYPE html>
<html>
  <head>
    <title>My First HTML Page</title>
    <style>
        /* Gallery grid layout */
        .gallery {
        display: grid;
        grid-template-columns: repeat(3, 1fr);
        grid-gap: 10px;
        justify-content: center;
        align-items: center;
        margin: 0 auto;
        width: 600px;
        position: relative;
      }

      /* Image styles */
      .gallery img {
        width: 200px;
        height: 200px;
        box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
        border: 15px solid white;
        border-radius: 5px;
        transition: opacity 0.5s, transform 0.5s;
      }

      /* Image hover styles */
      .gallery img:hover {
        box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);
        animation: rotate 2s infinite;
        opacity: 1 !important;
      }

      /* Gallery hover styles */
      .gallery:hover img {
        opacity: 0.6;
      }

      /* Image rotation animation */
      @keyframes rotate {
        0%, 100% {
          transform: rotate(0deg);
        }
        50% {
          transform: rotate(5deg);
        }
      }

      
    </style>
  </head>
  <body>
    <h1>Hello World!</h1>
    <p>This is my first HTML page.</p>
    <!-- image gallery using random images from the unsplash page. For further styling already add appropriate classes. All images should have the same width and height -->
    <div class="gallery">
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 1"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 2"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 3"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 4"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 5"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 6"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 7"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 8"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 9"
      />
    </div>
  </body>
</html>
```

Refresh your browser to see the opacity effect on the non-hovered images in the gallery. Hover with your mouse over the different images to see the opacity effect.

## Removing elements from the gallery

In this step, you will remove one image from the gallery when you click on it. Be careful with the events of the DOM elements. Some elements might not be available when the page is loaded.

> [!Important]
> Use Github Copilot chat to generate the JavaScript code for removing an image from the gallery when you click on it. Remember to have the index.html file open in the editor.

> [!Tip]
> - You can use the following prompt in the chat: ``I would like to remove an element from the image gallery when clicking on it. Can you return the whole html page with the new added javascript?``
> - Copy over the generated JavaScript code to your html file.
> - Ask Copilot chat why a script tag can be placed in the body tag: ``Why is it better in this case to place the script tag at the end of the body tag?``
>

### Solution

```html
<!-- very basic structure of a modern html page with head body etc -->
<!DOCTYPE html>
<html>
  <head>
    <title>My First HTML Page</title>
    <style>
      /* Gallery grid layout */
      .gallery {
        display: grid;
        grid-template-columns: repeat(3, 1fr);
        grid-gap: 10px;
        justify-content: center;
        align-items: center;
        margin: 0 auto;
        width: 600px;
        position: relative;
      }

      /* Image styles */
      .gallery img {
        width: 200px;
        height: 200px;
        box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
        border: 15px solid white;
        border-radius: 5px;
        transition: opacity 0.5s, transform 0.5s;
      }

      /* Image hover styles */
      .gallery img:hover {
        box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);
        animation: rotate 2s infinite;
        opacity: 1 !important;
      }

      /* Gallery hover styles */
      .gallery:hover img {
        opacity: 0.6;
      }

      .fade-out {
        opacity: 0;
        transition: opacity 3s ease-out;
      }

      /* Image rotation animation */
      @keyframes rotate {
        0%,
        100% {
          transform: rotate(0deg);
        }
        50% {
          transform: rotate(5deg);
        }
      }
    </style>
  </head>
  <body>
    <!-- image gallery using random images from the unsplash page. For further styling already add appropriate classes. All images should have the same width and height -->
    <div class="gallery">
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 1"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 2"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 3"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 4"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 5"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 6"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 7"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 8"
      />
      <img
        src="https://source.unsplash.com/random/200x200"
        alt="Random Image 9"
      />
    </div>

    <script>
      // Select all images in the gallery
      var images = document.querySelectorAll(".gallery img");

      // Add an event listener to each image
      images.forEach(function (image) {
        image.addEventListener("click", function (e) {
          // Remove the image when it's clicked
          e.target.remove();
        });
      });
    </script>
  </body>
</html>
```

## Summary

