#!/usr/bin/perl -w

use lib '/Users/andres/perl5/lib/perl5';
use SOAP::Lite +trace => 'debug';
use strict;

my $soap = 
    SOAP::Lite->uri('http://random.ch4.jwsur2.com/')->proxy('http://localhost:8080/JWSURCh4Random/');
my $num = $soap->next1()->result();
print "Response is: $num\n";

