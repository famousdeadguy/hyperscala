package org.hyperscala.todomvc

import org.hyperscala.WebPage
import org.hyperscala.tags._
import attributes.InputType

object TodoMVC extends WebPage("index.html") {
  head.title := "Webframework - TodoMVC"
  head.contents += new Link(rel = "stylesheet", href = "css/base.css")
  head.contents += new Link(rel = "stylesheet", href = "css/app.css")

  body.contents += new Section(id = "todoapp") {
    contents += new Header(id = "header") {
      contents += new H1(content = "todos")
      contents += new Input(id = "new-todo", placeHolder = "What needs to be done?", autoFocus = "autofocus")
    }
    contents += new Section(id = "main") {
      contents += new Input(id = "toggle-all", inputType = InputType.CheckBox)
      contents += new Label(forElement = "toggle-all", content = "Mark all as complete")
      contents += new Ul(id = "todo-list") {
        contents += new Li(clazz = "completed") {
          contents += new Div(clazz = "view") {
            contents += new Input(clazz = "toggle", inputType = InputType.CheckBox, checked = "checked")
            contents += new Label(content = "Create a TodoMVC template")
            contents += new Button(clazz = "destroy")
          }
          contents += new Input(clazz = "edit", value = "Create a TodoMVC template")
        }
        contents += new Li {
          contents += new Div(clazz = "view") {
            contents += new Input(clazz = "toggle", inputType = InputType.CheckBox)
            contents += new Label(content = "Rule the web")
            contents += new Button(clazz = "destroy")
          }
          contents += new Input(clazz = "edit", value = "Rule the web")
        }
      }
    }
    contents += new Footer(id = "footer") {
      contents += new Span(id = "todo-count") {
        contents += new Strong(content = "1")
        contents += " item left"
      }
      contents += new Ul(id = "filters") {
        contents += new Li {
          contents += new A(clazz = "selected", href = "#", content = "All")
        }
        contents += new Li {
          contents += new A(href = "#/active", content = "Active")
        }
        contents += new Li {
          contents += new A(href = "#/completed", content = "Completed")
        }
      }
      contents += new Button(id = "clear-completed", content = "Clear completed (1)")
    }
  }
  body.contents += new Footer(id = "info") {
    contents += new P(content = "Double-click to edit a todo")
    contents += new P {
      contents += "Template by "
      contents += new A(href = "http://github.com/sindresorhus", content = "Sindre Sorhus")
    }
    contents += new P {
      contents += "Created by "
      contents += new A(href = "http://www.matthicks.com", content = "Matt Hicks")
    }
    contents += new P {
      contents += "Part of "
      contents += new A(href = "http://www.todomvc.com", content = "TodoMVC")
    }
  }
  body.contents += new Script(src = "javascript/base.js")
  body.contents += new Script(src = "javascript/app.js")
}