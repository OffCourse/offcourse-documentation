// Scrollspy
function onScroll(){
  var scrollPosition = window.scrollY;
  var elem = document.querySelector('.js-nav');
  console.log(scrollPosition, elem.offsetTop);
  if (scrollPosition > elem.offsetTop){
    console.dir('bigger');
    elem.setAttribute("data-sheet-sticky", "true");
  } else {
    elem.setAttribute("data-sheet-sticky", "false");
  }
}

function onLoad(){
  window.addEventListener('scroll', onScroll);
}

window.onload = onLoad();



// Anchorscroll
$(function() {
  $('a[href*="#"]:not([href="#"])').bind('click', function(e) {
    e.preventDefault;
    if (location.pathname.replace(/^\//,'') == this.pathname.replace(/^\//,'') && location.hostname == this.hostname) {
      var target = $(this.hash);
      target = target.length ? target : $('[name=' + this.hash.slice(1) +']');
      if (target.length) {
        $('html, body').animate({
          scrollTop: target.offset().top
        }, 1000);
        return false;
      }
    }
  });
});