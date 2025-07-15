my $num1 = "10";  # string that looks like a number
my $num2 = 10;    # actual number

# A. Compare using ==
if ($num1 == $num2) {
    print "Using == : They are equal.\n";
} else {
    print "Using == : They are NOT equal.\n";
}

# B. Compare using eq
if ($num1 eq $num2) {
    print "Using eq : They are equal.\n";
} else {
    print "Using eq : They are NOT equal.\n";
}
