import org.apache.spark.sql.{DataFrame, SaveMode}

object Load {

  /**
   * Cette fonction permet de souvegarder les données dans un repertoire local
   * @param df : Dataframe
   * @param saveMode : methode de souvegarde
   * @param format : format des fichiers de sauvegarde
   * @param path : chemin où les données doivent etre sauvegardées
   * @return : Nothing
   */

  /*
  Ecrire une fontion de sauvegarder les données d'un dataframe spark
  Completer la fonction ci-dessous.
   */

  def saveData(df: DataFrame, saveMode: String, format: String, path: String): Unit = {
    val mode = saveMode.toLowerCase match {
      case "overwrite" => SaveMode.Overwrite
      case "append"    => SaveMode.Append
      case "ignore"    => SaveMode.Ignore
      case "error" | "errorifexists" => SaveMode.ErrorIfExists
      case _           => throw new IllegalArgumentException(s"Non supporté: $saveMode")
    }

    df.write.mode(mode).format(format).save(path)
  }


}
