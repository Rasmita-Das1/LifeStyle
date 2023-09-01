/**
 * 
 */
 
var slideIndex = 0;

function showSlide(n) {
    var slides = document.getElementsByClassName("slide");
    
    if (n >= slides.length) {
        slideIndex = 0;
    }
    if (n < 0) {
        slideIndex = slides.length - 1;
    }
    
    for (var i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }
    
    slides[slideIndex].style.display = "block";
}

function changeSlide(n) {
    showSlide(slideIndex += n);
}

// Initial call to show the first slide
showSlide(slideIndex);
