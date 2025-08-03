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