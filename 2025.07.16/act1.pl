@marks=(23,24,56,88,87,46);
splice(@marks,2,3,97..100);
print "@marks\n";

$languages="perl=python=java=unix=DNS";
@languages=split("=",$languages);
print "@languages\n";

$languages=join("|",@languages);
print "$languages\n";

@languages=("perl","python","java","unix","DNS");
@languages=sort(@languages);
print "@languages\n";

@languages=("perl","python","java","unix","DNS");
push(@languages,"Add");
print "@languages\n";

$remove=pop(@languages);
print "$remove\n";
print "@languages\n";

$remove=shift(@languages);
print "$remove\n";
print "@languages\n";

unshift(@languages,"Begin","hello");
print "@languages\n";
