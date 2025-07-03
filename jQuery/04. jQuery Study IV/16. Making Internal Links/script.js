$(function(){
  
    // Social media button
    $('.social-icon').hover(
      function(){
        $(this).children('span').animate({
          'font-size':'30px'
        }, 300);
      },
      function(){
        $(this).children('span').animate({
          'font-size':'24px'
        }, 300);
      }
    );
    
    // When the #top-btn element is clicked
    $('#top-btn').click(function(){
      // Using the scrollTop method,
      // scroll to the very top of the page
      $('html, body').scrollTop(0);
    });
    
  });