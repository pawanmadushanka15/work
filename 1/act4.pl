my $word="Elephant";
print length($word),"\n";
print lc($word),"\n";
print uc($word),"\n";

my $phrase="Welcome";
print "First charcter lowercase only: ",lcfirst($phrase),"\n";
my $text="tiger";
print "First character uppercase only: ",ucfirst($text),"\n";
print "Remove last character:",chop($phrase),"\n";
print "After chop,phrase is now:$phrase\n";

my $string="Banana";
print index($string,"a"),"\n";
print rindex($string,"a"),"\n";

my $fruit="pineapple";
print substr($fruit,4,3),"\n";

my $name="Lion";
my $reversed=reverse($name),"\n";
print $reversed,"\n";

my $line="cat,dog,bird";
my @animal=split(",",$line);
print $animal[1],"\n";

my @colors=("red","green","blue");
print join("-",@colors),"\n";
