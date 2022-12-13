/**
 * 子孫グリッド定義
 */

let TShisonGridColumns = [
    Column.refer('SOSEN_ID', Messages['TShisonGrid.sosenId'], 150, 'primaryKey numbering', 'null'),
    Column.comma('OYA_SN', Messages['TShisonGrid.oyaSn'], 150, 'primaryKey numbering', null),
    Column.comma('ENTITY_SN', Messages['TShisonGrid.entitySn'], 150, 'primaryKey numbering', null),
    Column.comma('KO_SN', Messages['TShisonGrid.koSn'], 150, 'primaryKey numbering', null),
    Column.comma('SHISON_SN', Messages['TShisonGrid.shisonSn'], 150, 'primaryKey numbering', null),
    Column.text('SHISON_MEI', Messages['TShisonGrid.shisonMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TShisonGrid.insertDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TShisonGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TShisonGrid.updateDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TShisonGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TShisonGrid.deleteF'], 30, ''),
];
