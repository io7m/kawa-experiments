package com.io7m.kawa_exp;

import kawa.standard.Scheme;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public final class SchemeExp0
{
  private static final Logger LOG = LoggerFactory.getLogger(SchemeExp0.class);

  private SchemeExp0()
  {

  }

  public static void main(
    final String[] args)
    throws Throwable
  {
    final Scheme interp = new Scheme();

    try (InputStream is =
           SchemeExp0.class.getResourceAsStream(
             "/com/io7m/kawa_exp/demo0.scm")) {
      try (Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8)) {
        final Object r = interp.eval(reader);
        LOG.debug("result: {}", r);
      }
    }
  }
}
