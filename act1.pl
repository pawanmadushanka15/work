#if examples
my @skills=("Perl","Python","Java","Unix","Shell");

if ($skills[-1] eq "Shell")
{
	print "if statment true";
}
else{
	print "if Statement false";
}

print "\n";

#else if examples
if ($skills[-3] eq "Shell")
{
	print "if statment true";
}
elsif($skills[0] eq "Perl"){
	print "if Statement false";
}
else{
	print "Else true";
}

print "\n";
#perl nested if 
if($skills[0] eq "Perl")
{
	if($skills[-1] eq "Shell")
	{
		print "Both statement are true";
	}
}

print "\n";
#unless examples
unless(scalar @skills==5){
	print "Condition is false";
}else{
	print "Condition is True";
}

print "\n";
unless(scalar @skills==5){
	print "Condition is false";
}elsif($skills[0] eq "Perl"){
	print /$skills[0] element is '$skills[0]'";
}else{
	print "Done!";
}