my $line="cat,dog,bird";
my @animal=split(",",$line);
print join(",",@animal),"\n";
print $animal[1],"\n";