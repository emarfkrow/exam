/**
 * 子孫グリッド定義
 */

let TShisonGridColumns = [
    Column.refer('SOSEN_ID', Messages['TShisonGrid.sosenId'], 150, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['TShisonGrid.oyaBn'], 150, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['TShisonGrid.entityBn'], 150, 'primaryKey numbering', null),
    Column.comma('KO_BN', Messages['TShisonGrid.koBn'], 150, 'primaryKey numbering', null),
    Column.comma('SHISON_BN', Messages['TShisonGrid.shisonBn'], 150, 'primaryKey numbering', null),
    Column.text('SHISON_MEI', Messages['TShisonGrid.shisonMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TShisonGrid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TShisonGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TShisonGrid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TShisonGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TShisonGrid.deleteF'], 30, ''),
];
