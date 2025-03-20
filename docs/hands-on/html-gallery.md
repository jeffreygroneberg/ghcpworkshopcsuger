# HTML Image Gallery Lab 🖼️

In this hands-on lab, you'll build an interactive image gallery with animations using HTML, CSS, and JavaScript with the help of GitHub Copilot! This lab demonstrates how GitHub Copilot can assist with front-end development tasks.

## Lab Overview 📋

**Duration**: 45 minutes  
**Difficulty**: Beginner-Intermediate  
**Prerequisites**: Basic knowledge of HTML, CSS, and JavaScript  

## What You'll Build 🏗️

A beautiful polaroid-style image gallery with the following features:
- Grid layout for displaying images
- Hover effects with opacity changes
- Rotation animations on hover
- Click functionality to remove images

## Getting Started 🚀

### Step 1: Create a Basic HTML Structure

First, let's create a basic HTML structure for our page. Open a new file in your editor and ask GitHub Copilot to help you create a basic HTML structure.

> 💡 **Copilot Tip**: Try typing a comment like `<!-- very basic structure of a modern html page with head body etc -->` and let Copilot generate the initial HTML structure.

Your initial HTML should look something like this:

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
  </body>
</html>
```

### Step 2: Add an Image Gallery

Now, let's add an image gallery to our page. We'll use GitHub Copilot to help us create a grid of images.

> 💡 **Copilot Tip**: Add a comment describing what you want to create, such as `<!-- image gallery using random images from the picsum page. For further styling already add appropriate classes. All images should have the same width and height -->`

After Copilot generates the code, your HTML should include something like:

```html
<!-- image gallery using random images from the picsum page. For further styling already add appropriate classes. All images should have the same width and height -->
<div class="gallery">
  <img src="https://picsum.photos/200/200" alt="image 1">
  <img src="https://picsum.photos/200/200" alt="image 2">
  <img src="https://picsum.photos/200/200" alt="image 3">
  <img src="https://picsum.photos/200/200" alt="image 4">
  <img src="https://picsum.photos/200/200" alt="image 5">
  <img src="https://picsum.photos/200/200" alt="image 6">
  <img src="https://picsum.photos/200/200" alt="image 7">
  <img src="https://picsum.photos/200/200" alt="image 8">
  <img src="https://picsum.photos/200/200" alt="image 9">
  <img src="https://picsum.photos/200/200" alt="image 10">
</div>
```

### Step 3: Style the Gallery with CSS

Let's add some CSS to style our gallery. We'll create a grid layout and add some basic styling to the images.

> 💡 **Copilot Tip**: Add a style tag in the head section and add a comment describing the styling you want to create.

Add this to your head section:

```html
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
</style>
```

### Step 4: Add Hover Effects

Now, let's add some hover effects to make our gallery more interactive.

> 💡 **Copilot Tip**: Add comments describing the hover effects you want to create.

Add these styles to your existing style tag:

```css
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
```

Refresh your browser to see the opacity effect on the non-hovered images in the gallery. Hover with your mouse over the different images to see the opacity effect.

### Step 5: Add Click Functionality to Remove Images

In this step, you will add JavaScript to remove an image from the gallery when you click on it.

> 💡 **Copilot Tip**: Use GitHub Copilot chat to generate the JavaScript code for removing an image from the gallery when you click on it. Remember to have the index.html file open in the editor.
>
> You can use the following prompt in the chat: "I would like to remove an element from the image gallery when clicking on it. Can you return the whole html page with the new added javascript?"

After adding the JavaScript, your complete HTML should look something like this:

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
    <!-- image gallery using random images from the picsum page. For further styling already add appropriate classes. All images should have the same width and height -->
    <div class="gallery">
      <img src="https://picsum.photos/200/200" alt="image 1">
      <img src="https://picsum.photos/200/200" alt="image 2">
      <img src="https://picsum.photos/200/200" alt="image 3">
      <img src="https://picsum.photos/200/200" alt="image 4">
      <img src="https://picsum.photos/200/200" alt="image 5">
      <img src="https://picsum.photos/200/200" alt="image 6">
      <img src="https://picsum.photos/200/200" alt="image 7">
      <img src="https://picsum.photos/200/200" alt="image 8">
      <img src="https://picsum.photos/200/200" alt="image 9">
      <img src="https://picsum.photos/200/200" alt="image 10">
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

> 💡 **Copilot Tip**: Ask Copilot chat why a script tag can be placed in the body tag: "Why is it better in this case to place the script tag at the end of the body tag?"

## Bonus Challenges 🌟

If you have extra time, try these bonus challenges with GitHub Copilot:

1. Add a button to reset the gallery (bring back all removed images)
2. Add a fade-out animation before removing the images
3. Add a counter to show how many images are currently displayed
4. Add a filter effect (like grayscale or sepia) on hover

## Summary 📝

In this lab, you've learned how to:
- Use GitHub Copilot to generate HTML, CSS, and JavaScript code
- Create an interactive image gallery with hover effects and animations
- Implement click functionality to remove elements from the DOM
- Use GitHub Copilot chat to get explanations and improve your code

GitHub Copilot has helped you write code faster and with less effort, allowing you to focus on the creative aspects of your project rather than the implementation details. This is just a small example of how AI-assisted coding can enhance your development workflow! 🚀
