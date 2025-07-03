<?php
$menus = array(
  array('name' => 'CURRY', 'price' => 9),
  array('name' => 'PASTA', 'price' => 12),
  array('name' => 'COFFEE', 'price' => 6)
);

// Write your code below
$total = 0;
$terbesar = 0;
$namamenu = '';
foreach ($menus as $menu){
  echo $menu['name'].' is $'.$menu['price'].'<br>';
  $total += $menu['price'];
  if ($terbesar < $menu['price']){
    $terbesar = $menu['price'];
    $namamenu = $menu['name'];
  }
}
echo 'The total price is $'.$total.'<br>';
echo 'The most expensive item is '.$namamenu.' with the price $'.$terbesar;
?>