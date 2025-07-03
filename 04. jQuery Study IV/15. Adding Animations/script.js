$(function(){
    //  When the cursor hovers over the .social-icon element
    $('.social-icon').hover(
      function(){
        //  Change the element's font-size to 30px and ...
        $(this).animate({
          'font-size':'30px'
        }, 300);
      },
      function(){
        //  Change the font-size to 24px when the cursor is not hovering over the element
        $(this).animate({
          'font-size':'24px'
        }, 300);
      }
    );
    
  });