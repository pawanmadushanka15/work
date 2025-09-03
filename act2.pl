print "Enter nucleotide sequence (A/T/G/C): ";
my $seq1 = <STDIN>;
chomp($seq1);
if ($seq1 !~ /^[ATGC]+$/i){
    die "Invalid nucleotide! Please enter only A, T, G, or C\n";
}

print "\n-------\n";

print "Enter nucleotide to delete (A/T/G/C): ";
my $del = <STDIN>;
chomp($del);
if ($del !~ /^[ATGC]$/i){
    die "Invalid nucleotide! Please enter only A, T, G, or C\n";
}

print "\n-------\n";

my $new_seq1 = $seq1;
$new_seq1 =~ s/$del//gi;

print "\nOriginal sequence: $seq1\n";
print "Modified sequence: $new_seq1\n";


