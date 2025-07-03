<?php
$prices = array(10, 6, 7, 8);
echo 'Value of $prices: ';
foreach ($prices as $price) {
  echo $price.' ';
}
echo '<br>';
echo '-----';
echo '<br>';

// Write your code below
$total = 0;
$terbesar = 0; // Variable for the max price
foreach ($prices as $price) {
  $total += $price;
  // When greater than the value stored in $maxPrice
  if ($price > $terbesar) {
    // Update $maxPrice with the higher value
    $terbesar = $price;
  }
}
echo 'The total price is $'.$total;
echo '<br>';
echo 'The highest price is $'.$terbesar;
?>