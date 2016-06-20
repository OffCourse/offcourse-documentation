// Attachment on scroll
function onScroll(offsets, startPos){
  var scrollPos = window.scrollY;
  var elem = document.querySelector('.js-nav');
  var newOffset = 0;
  console.log(offsets, startPos)
  offsets.forEach(function(offset){
    if (scrollPos + 400 > offset){
      newOffset = offset;
    }
  })
  if (newOffset <= 0 ){
    elem.style.marginTop = 0 + "px" ;
  } else {
    elem.style.marginTop = (newOffset - startPos) + "px" ;
  }
}

function onLoad(){
  var startPos = document.querySelector('.js-nav').offsetTop;
  var offsets = [0];
  document.querySelectorAll('.js-anchor').forEach(function(value){offsets.push(value.offsetTop)});
  window.addEventListener('scroll', onScroll.bind(null, offsets, startPos));
}

window.onload = onLoad();

// Smooth anchorscroll
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