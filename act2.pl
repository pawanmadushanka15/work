print "Enter a number:";
my $number=<STDIN>;
chomp($number);
if ($number%2==0){
	print "This is an even number";
}
else{
	print "This is an odd number";
}
print "\n";


print "Enter mark:";
my $mark=<STDIN>;
chomp($mark);
if ($mark>=50){
	print "Pass";
}
print "\n";

print "Enter number:";
my $number=<STDIN>;
chomp($number);
unless ($number<0){
	print "Positive number";}
print "\n";


print "Enter mark:";
my $mark=<STDIN>;
chomp($mark);
if ($mark>=70){
	print "High";
}elsif (30<=$mark<=69){
	print "Medium";
}else{
	print "Low";
}
print "\n";

print "Enter string:";
my $str=<STDIN>;
chomp($str);
unless ($str eq ""){
	print "String";
}else{
	print "empty string";
}
print "\n";

print "Enter age:";
my $age=<STDIN>;
chomp($age);
if ($age>=18)
{
	print "Do you have an ID:";
	my $ID=<STDIN>;
	chomp($ID);
	unless ($ID eq "yes")
	{
		print "NO ID";
	}
}
print "Too young";
print "\n";

print "Enter username:";
my $username=<STDIN>;
chomp($username);
print "Enter password:";
my $password=<STDIN>;
chomp($password);
unless ($username eq "" or $password eq ""){
	if ($username eq "admin" and $password eq "1234"){
		print "Acess granted";
	}else{
		print "Acess denied";
	}
}else
{
	print "Missing Credentials";
}