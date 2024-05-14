package br.com.fiap.listadecompras.model

val item = itemModel(
    name = editText.text.toString(),
    onRemove = {
        ItemsAdapter.removeItem(it)
    }
)