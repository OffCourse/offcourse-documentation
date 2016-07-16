// Attachment on scroll

// Todo: needs updating on window resize
// Todo: needs disabling on phones -> fallback to header nav

var assignedEvents = [];

function initScroll(){

  assignedEvents.forEach(function(func){
    window.removeEventListener('scroll', func);
  });

  var elem = document.querySelector('.js--nav');
  elem.style.marginTop = 0 + 'px' ;
  var startPos = document.querySelector('.js--nav').offsetTop;

  var offsets = [0];  
  document.querySelectorAll('.js--anchor').forEach(function(anchorItem){offsets.push(anchorItem.offsetTop)});

  function onScroll(){
    var elem = document.querySelector('.js--nav');
    var scrollPos = window.scrollY;
    if (scrollPos < startPos) {
      elem.style.marginTop = 0 + 'px' ;
    } else {
      var newOffset = offsets.reduce(function (prev, curr) {
        return (prev > scrollPos + 30 ? prev : curr);
      });
      elem.style.marginTop = (newOffset - startPos) + 'px' ;
    }
    console.log("newOffset:", newOffset, "startPos:", startPos)
  }

  window.addEventListener('scroll', onScroll);
  assignedEvents.push(onScroll);
}

$(function(){
  initScroll();
  window.addEventListener('resize', initScroll);
});

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

// Code parsing
function findCSS(selector){
  var rules = document.styleSheets['1'].cssRules; // Stylesheet selection really britte!
  for (var i = 0; i < rules.length; i++){
    if (rules[i].selectorText == selector){
      return text = rules[i].cssText;
    }
  }
}

// Code hightlighting
$(function() {
  var elems = document.querySelectorAll('code');
  for (var i = 0; i < elems.length; i++){
    var code = findCSS(elems[i].dataset.class);
    elems[i].innerHTML = code;
  }
  hljs.initHighlightingOnLoad();
});