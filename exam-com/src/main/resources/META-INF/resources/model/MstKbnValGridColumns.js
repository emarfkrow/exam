/**
 * 区分値マスタグリッド定義
 */

let MstKbnValGridColumns = [
    Column.refer('KBN_NM', Messages['MstKbnValGrid.kbnNm'], 240, 'primaryKey', 'null'),
    Column.text('KBN_VAL', Messages['MstKbnValGrid.kbnVal'], 30, 'primaryKey', null),
    Column.text('KBN_VAL_MEI', Messages['MstKbnValGrid.kbnValMei'], 300, '', null),
    Column.comma('HYOJI_ON', Messages['MstKbnValGrid.hyojiOn'], 80, '', null),
    Column.text('CRITERIA', Messages['MstKbnValGrid.criteria'], 300, '', null),
    Column.cell('INSERT_DT', Messages['MstKbnValGrid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MstKbnValGrid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MstKbnValGrid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MstKbnValGrid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MstKbnValGrid.deleteF'], 30, ''),
];
