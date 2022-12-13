/**
 * コードマスタグリッド定義
 */

let MCodeGridColumns = [
    Column.text('CODE_NM', Messages['MCodeGrid.codeNm'], 300, 'primaryKey', null),
    Column.text('CODE_MEI', Messages['MCodeGrid.codeMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['MCodeGrid.insertDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MCodeGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MCodeGrid.updateDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MCodeGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MCodeGrid.deleteF'], 30, ''),
];
