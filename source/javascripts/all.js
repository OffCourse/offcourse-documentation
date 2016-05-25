// Scrollspy

// // Cache selectors
// var lastId,
//     topMenu = $("#nav"),
//     topMenuHeight = topMenu.outerHeight(),
//     // All list items
//     menuItems = topMenu.find("a"),
//     // Anchors corresponding to menu items
//     scrollItems = menuItems.map(function() {
//         var item = $($(this).attr("href"));
//         if (item.length) {
//             return item;
//         }
//     });

// // Bind click handler to menu items
// // so we can get a fancy scroll animation
// menuItems.click(function(e) {
//     var href = $(this).attr("href"),
//         o = href === "#" ? 0 : $(href).offset().top - topMenuHeight;
//     $('html, body').stop().animate({
//         scrollTop: o
//     }, 300);
//     e.preventDefault();
// });

// // Bind to scroll
// $(window).scroll(function() {
//     // Get container scroll position
//     var fromTop = $(this).scrollTop() + topMenuHeight;

//     // Get id of current scroll item
//     var cur = scrollItems.map(function() {
//         if ($(this).offset().top < fromTop)
//             return this;
//     });
//     // Get the id of the current element
//     cur = cur[cur.length - 1];
//     var id = cur && cur.length ? cur[0].id : "";

//     if (lastId !== id) {
//         lastId = id;
//         // Set/remove active class
//         menuItems
//             .parent().removeClass("active")
//             .end().filter("[href=#" + id + "]").parent().addClass("active");
//     }
// });

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