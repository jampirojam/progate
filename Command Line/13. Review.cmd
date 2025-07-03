~ $ mkdir home
~ $ cd home
home $ mkdir website
home $ cd website
website $ mkdir top
website $ cd top
top $ touch top.html
top $ touch stylesheet.css
top $ cd ..
website $ cp -r top about
website $ cd about
about $ mv top.html about.html
about $ cd
~ $ rm about.txt