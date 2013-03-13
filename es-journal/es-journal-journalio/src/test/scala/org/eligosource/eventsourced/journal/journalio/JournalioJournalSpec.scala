/*
 * Copyright 2012-2013 Eligotech BV.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eligosource.eventsourced.journal.journalio

import java.io.File

import org.apache.commons.io.FileUtils
import org.scalatest.BeforeAndAfterEach

import org.eligosource.eventsourced.journal.common.JournalSpec

class JournalioJournalSpec extends JournalSpec with BeforeAndAfterEach {
  val journalDir = new File("es-journal/es-journal-journalio/target/journal")
  def journalProps = JournalioJournalProps(journalDir)

  override def afterEach() {
    FileUtils.deleteDirectory(journalDir)
  }
}
