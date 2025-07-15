@arr=("one","two","three");
print "$arr[0]\n";
print "$arr[1]\n";

@arr=qw(a b c d);
print "$arr[1]\n";

my @year;
$year[0]=2009;
$year[0]=2010;
print "$year[0]\n";
print join(" ",@year,"\n");

@array=(1,2,3);
print "Size:",scalar @array,"\n";
$size=@array;
print "$size\n";

@languages=("python","perl","java","C#","C++","Rubby");
print "$languages[-1]\n";

print "$languages[0]\n";
print "@languages[2..5]";