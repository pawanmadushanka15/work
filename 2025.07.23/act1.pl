%Experience=("Perl"=>5,"Java"=>5,"Python"=>2);
print $Experience{"Perl"},"\n";

@ExperienceKey=keys %Experience;
print "Keys:@ExperienceKey\n";

@ExperienceValue=values %Experience;
print "Values:@ExperienceValue\n";

$length=scalar(@ExperienceValue);
print "$length\n";

if (exists($Experience{"Perl"}))
{
    print "Exist!!\n";
}
else 
{
    print "Not Exist!!\n";
}

$Experience{"Oracle"}=2;
print %Experience,"\n";

delete $Experience{"Oracle"};