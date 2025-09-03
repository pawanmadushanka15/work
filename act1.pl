my @skills=qw(Perl Python Unix);
foreach (0..$#skills){
    print "$skills[$_]\n";
}

print "-------\n";

foreach my $i(0..$#skills){
    print "$skills[$i]\n";
}

print "-------\n";

my $i=1;
while ($i<5){
    print "$i";
    $i++;
}

print "\n-------\n";

my $i=10;
do{
    print "$i";
    $i++
}while($i<5);

print "\n-------\n";

my $i=1;
until($i>3){
    print "$i";
    $i++;
}

print "\n-------\n";

sub PrintList{
    my @list=@_;
    print "Given list is @list\n";
    print "Second list element is @list[1]\n";
    
}

$x=10;
@y=(1,2,3,4);
PrintList($x,@y);

print "\n-------\n";

sub sum{
    my($a,$b)=@_;
    my $C=$a+$b;
}
my $sum=sum(10,20);
print "$sum";

print "\n-------\n";

my $text="I like apples";
$text=~s/apples/oranges/;
print "$text";

print "\n-------\n";

my $fruit="banana";
my $sentence="I like banana pie";

$senetence=~s/$fruit/apple/;
print $sentence;
