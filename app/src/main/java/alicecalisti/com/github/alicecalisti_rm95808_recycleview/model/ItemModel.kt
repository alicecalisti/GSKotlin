package alicecalisti.com.github.alicecalisti_rm95808_recycleview.model

data class ItemModel(val praia: String,val cidade: String, val estado: String,val onRemove: (ItemModel) -> Unit )