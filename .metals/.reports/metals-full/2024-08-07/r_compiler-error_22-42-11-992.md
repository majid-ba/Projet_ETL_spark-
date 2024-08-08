file://<WORKSPACE>/src/main/scala/Transform.scala
### file%3A%2F%2F%2Fhome%2Fmajid%2FDocuments%2FBigData%2Fproject_scala_spark%2Fsrc%2Fmain%2Fscala%2FTransform.scala:94: error: `}` expected but `end of file` found

^

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.12.19
Classpath:
<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.12.19/scala-library-2.12.19.jar [exists ]
Options:



action parameters:
uri: file://<WORKSPACE>/src/main/scala/Transform.scala
text:
```scala
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.col

object Transform {

  /**
   * Cette fonction permet de nettoyer les données brutes.
   * @param df : Dataframe
   * @return Dataframe
   */

  def cleanData(df: DataFrame): DataFrame = {

  
    /*
    0. Traiter toutes les colonnes en date timestamp vers YYYY/MM/DD HH:MM SSS.
     */

   // val firstDF = df.FILL_IN

    /*
    1. Extraire les revenus d'achat pour chaque événement
      - Ajouter une nouvelle colonne nommée revenue en faisant l'extration de ecommerce.purchase_revenue_in_usd
     */

   // val revenueDF = firstDF.FILL_IN

    /*
    2. Filtrer les événements dont le revenu n'est pas null
    */
  //  val purchasesDF = revenueDF.FILL_IN


    /*
    3. Quels sont les types d'événements qui génèrent des revenus ?
      Trouvez des valeurs event_name uniques dans purchasesDF.
      Combien y a t-il de type d'evenement ?
     */

    //val distinctDF = purchasesDF.FILL_IN

    /*
     4. Supprimer la/les colonne(s9 inutile(s)
      - Supprimez event_name de purchasesDF.
      */

  //  val cleanDF = distinctDF.FILL_IN

   // cleanDF

  //}


  /**
   * Cette fonction permet de récuperer le revenu cumulé par source de traffic, par0 etat et par ville
   * @param df : Dataframe
   * @return Dataframe
   */



  def computeTrafficRevenue(df : DataFrame): DataFrame = {

    /*
    5. Revenus cumulés par source de trafic par état et par ville city
      - Obtenir la somme de revenue comme total_rev
      - Obtenir la moyenne de revenue comme avg_rev
     */

    //val trafficDF = df.FILL_IN

    /*
    6. Recuperer les cinqs principales sources de trafic par revenu total

     */
   // val topTrafficDF = trafficDF.FILL_IN


    /*
    7. Limitez les colonnes de revenus à deux décimales pointés
      Modifier les colonnes avg_rev et total_rev pour les convertir en des nombres avec deux décimales pointés
     */

   // val finalDF = topTrafficDF.FILL_IN

    finalDF


  }



}

```



#### Error stacktrace:

```
scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$expectAt(ScalametaParser.scala:396)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$expectAt(ScalametaParser.scala:400)
	scala.meta.internal.parsers.ScalametaParser.expect(ScalametaParser.scala:402)
	scala.meta.internal.parsers.ScalametaParser.accept(ScalametaParser.scala:418)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$acceptAfterOpt(ScalametaParser.scala:441)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$acceptAfterOptNL(ScalametaParser.scala:445)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$inBracesAfterOpen(ScalametaParser.scala:269)
	scala.meta.internal.parsers.ScalametaParser.inBracesOr(ScalametaParser.scala:260)
	scala.meta.internal.parsers.ScalametaParser.inBraces(ScalametaParser.scala:256)
	scala.meta.internal.parsers.ScalametaParser.templateBody(ScalametaParser.scala:4006)
	scala.meta.internal.parsers.ScalametaParser.templateBodyOpt(ScalametaParser.scala:4009)
	scala.meta.internal.parsers.ScalametaParser.templateAfterExtends(ScalametaParser.scala:3960)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$templateOpt$1(ScalametaParser.scala:4001)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:325)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:369)
	scala.meta.internal.parsers.ScalametaParser.templateOpt(ScalametaParser.scala:3993)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$objectDef$1(ScalametaParser.scala:3722)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:372)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:377)
	scala.meta.internal.parsers.ScalametaParser.objectDef(ScalametaParser.scala:3714)
	scala.meta.internal.parsers.ScalametaParser.tmplDef(ScalametaParser.scala:3601)
	scala.meta.internal.parsers.ScalametaParser.topLevelTmplDef(ScalametaParser.scala:3589)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$2.applyOrElse(ScalametaParser.scala:4121)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$2.applyOrElse(ScalametaParser.scala:4115)
	scala.PartialFunction.$anonfun$runWith$1$adapted(PartialFunction.scala:145)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4107)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$statSeq$1(ScalametaParser.scala:4096)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$statSeq$1$adapted(ScalametaParser.scala:4096)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$listBy(ScalametaParser.scala:562)
	scala.meta.internal.parsers.ScalametaParser.statSeq(ScalametaParser.scala:4096)
	scala.meta.internal.parsers.ScalametaParser.bracelessPackageStats$1(ScalametaParser.scala:4285)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$source$1(ScalametaParser.scala:4288)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:325)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:369)
	scala.meta.internal.parsers.ScalametaParser.source(ScalametaParser.scala:4264)
	scala.meta.internal.parsers.ScalametaParser.entrypointSource(ScalametaParser.scala:4291)
	scala.meta.internal.parsers.ScalametaParser.parseSourceImpl(ScalametaParser.scala:119)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$parseSource$1(ScalametaParser.scala:116)
	scala.meta.internal.parsers.ScalametaParser.parseRuleAfterBOF(ScalametaParser.scala:58)
	scala.meta.internal.parsers.ScalametaParser.parseRule(ScalametaParser.scala:53)
	scala.meta.internal.parsers.ScalametaParser.parseSource(ScalametaParser.scala:116)
	scala.meta.parsers.Parse$.$anonfun$parseSource$1(Parse.scala:30)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:37)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:22)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:15)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:161)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:469)
```
#### Short summary: 

file%3A%2F%2F%2Fhome%2Fmajid%2FDocuments%2FBigData%2Fproject_scala_spark%2Fsrc%2Fmain%2Fscala%2FTransform.scala:94: error: `}` expected but `end of file` found

^